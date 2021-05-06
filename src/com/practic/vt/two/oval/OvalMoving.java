package com.practic.vt.two.oval;

import javax.swing.*;
import java.awt.*;

public class OvalMoving extends JPanel implements Runnable{

    private int x = 250;
    private int y = 10;
    private final int width;
    private final int height;

    public OvalMoving(int width, int height){
        this.width = width;
        this.height = height;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLocation(750, 300);
        frame.setResizable(true);
        frame.add(this);
        frame.setVisible(true);
        new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, width, height);
    }

    @Override
    public void run() {
        while (y < 250){
            try {
                x = (int)(Math.cos((double) 4*y*Math.PI/180)*50)+100;
                y+=1;
                this.repaint();
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}