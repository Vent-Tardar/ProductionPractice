package com.practic.vt.two;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{

    private final JFrame frame = new JFrame();
    private final JButton rect = new JButton("Rectangle");
    private final JButton line = new JButton("Line");
    private final JButton triangle = new JButton("Triangle");
    private final JButton oval = new JButton("Oval");
    private final JButton point = new JButton("Point");

    LaunchPage(){

        rect.setBounds(100,25,200,40);
        rect.setFocusable(false);
        rect.addActionListener(this);
        rect.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        line.setBounds(100,70,200,40);
        line.setFocusable(false);
        line.addActionListener(this);
        line.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        triangle.setBounds(100,115,200,40);
        triangle.setFocusable(false);
        triangle.addActionListener(this);
        triangle.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        oval.setBounds(100,160,200,40);
        oval.setFocusable(false);
        oval.addActionListener(this);
        oval.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        point.setBounds(100,205,200,40);
        point.setFocusable(false);
        point.addActionListener(this);
        point.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        frame.add(rect);
        frame.add(line);
        frame.add(triangle);
        frame.add(oval);
        frame.add(point);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(750, 300);
        frame.getContentPane().setBackground(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == rect) {
            frame.dispose();
            String titleBtn = "Rectangle";
            new ActionsPage(titleBtn);
        }

        if(e.getSource() == line) {
            frame.dispose();
            String titleBtn = "Line";
            new ActionsPage(titleBtn);
        }

        if(e.getSource() == triangle) {
            frame.dispose();
            String titleBtn = "Triangle";
            new ActionsPage(titleBtn);
        }

        if(e.getSource() == oval) {
            frame.dispose();
            String titleBtn = "Oval";
            new ActionsPage(titleBtn);
        }

        if(e.getSource() == point) {
            frame.dispose();
            String titleBtn = "Point";
            new ActionsPage(titleBtn);
        }
    }
}
