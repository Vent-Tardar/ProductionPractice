package com.practic.vt.two.oval;

import javax.swing.*;
import java.awt.*;

public class OvalScalingUp extends JPanel implements Runnable{

    private int width;
    private int height;

    private int max = 150;
    private int min = 50;

    public OvalScalingUp(int width, int height){
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
        g.fillOval(145, 100, width, height);
    }

    @Override
    public void run() {
        for(int i = 0; i <= 5; i++){
            while (width <= max){
                try {
                    width += 1;
                    height += 1;
                    this.repaint();
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            while (width >= min){
                try {
                    width -= 1;
                    height -= 1;
                    this.repaint();
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
