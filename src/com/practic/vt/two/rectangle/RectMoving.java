package com.practic.vt.two.rectangle;

import javax.swing.*;
import java.awt.*;

public class RectMoving extends JPanel implements Runnable{

    private int x = 50;
    private int y = 50;

    public RectMoving(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 275);
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
        g.setColor(Color.MAGENTA);
        g.fillRect(x, y, 25, 25);
    }

    @Override
    public void run() {
        while (x < 500){
            try {
                x+=1;
                y = (int)(Math.sin((double) 4*x*Math.PI/180)*50)+100;
                this.repaint();
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
