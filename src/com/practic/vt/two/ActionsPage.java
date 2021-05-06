package com.practic.vt.two;

import com.practic.vt.two.line.Line;
import com.practic.vt.two.line.LineMoving;
import com.practic.vt.two.line.LineScalingUp;
import com.practic.vt.two.line.LineTurnAround;
import com.practic.vt.two.oval.Oval;
import com.practic.vt.two.oval.OvalMoving;
import com.practic.vt.two.oval.OvalScalingUp;
import com.practic.vt.two.oval.OvalTurnAround;
import com.practic.vt.two.rectangle.RectMoving;
import com.practic.vt.two.rectangle.RectScalingUp;
import com.practic.vt.two.rectangle.RectTurnAround;
import com.practic.vt.two.rectangle.Rectangle;
import com.practic.vt.two.triangle.TrianMoving;
import com.practic.vt.two.triangle.TrianScalingUp;
import com.practic.vt.two.triangle.TrianTurnAround;
import com.practic.vt.two.triangle.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionsPage implements ActionListener {

    private final JFrame frame = new JFrame();
    private final JButton standard = new JButton("Standard");
    private final JButton moving = new JButton("Moving");
    private final JButton scalingUp = new JButton("Scaling up");
    private final JButton turnAround = new JButton("Turn around");
    private final JButton back = new JButton("Back");

    public ActionsPage(String titleBtn) {
        System.out.println(titleBtn);
        frame.setTitle(titleBtn);
        standard.setBounds(100,25,200,40);
        standard.setFocusable(false);
        standard.addActionListener(this);
        standard.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        moving.setBounds(100,70,200,40);
        moving.setFocusable(false);
        moving.addActionListener(this);
        moving.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        scalingUp.setBounds(100,115,200,40);
        scalingUp.setFocusable(false);
        scalingUp.addActionListener(this);
        scalingUp.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        turnAround.setBounds(100,160,200,40);
        turnAround.setFocusable(false);
        turnAround.addActionListener(this);
        turnAround.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        back.setBounds(100,205,200,40);
        back.setFocusable(false);
        back.addActionListener(this);
        back.setBackground(Color.getHSBColor(0.58f, 0.17f, 0.95f));

        frame.add(standard);
        frame.add(moving);
        frame.add(scalingUp);
        frame.add(turnAround);
        frame.add(back);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(750, 300);
        frame.getContentPane().setBackground(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == standard) {
            frame.dispose();
            switch (frame.getTitle()) {
                case "Rectangle" -> new Rectangle();
                case "Triangle" -> new Triangle();
                case "Line" -> new Line();
                case "Oval" -> new Oval(100, 150);
                case "Point" -> new Oval(10, 10);
            }
        }

       if(e.getSource() == moving) {
            frame.dispose();
           switch (frame.getTitle()) {
               case "Rectangle" -> new RectMoving();
               case "Triangle" -> new TrianMoving();
               case "Line" -> new LineMoving();
               case "Oval" -> new OvalMoving(85, 100);
               case "Point" -> new OvalMoving(10, 10);
           }
        }

        if(e.getSource() == scalingUp) {
            frame.dispose();
            switch (frame.getTitle()) {
                case "Rectangle" -> new RectScalingUp();
                case "Triangle" -> new TrianScalingUp();
                case "Line" -> new LineScalingUp();
                case "Oval" -> new OvalScalingUp(55, 95);
            }
        }

        if(e.getSource() == turnAround) {
            frame.dispose();
            switch (frame.getTitle()) {
                case "Rectangle" -> new RectTurnAround();
                case "Triangle" -> new TrianTurnAround();
                case "Line" -> new LineTurnAround();
                case "Oval" -> new OvalTurnAround(125, 200);
            }
        }

        if(e.getSource() == back) {
            frame.dispose();
            LaunchPage launchPage = new LaunchPage();
        }
    }
}
