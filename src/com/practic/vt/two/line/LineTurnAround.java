package com.practic.vt.two.line;

import javax.swing.*;
import java.awt.*;

public class LineTurnAround extends JPanel implements Runnable{

    private int x1 = 175;
    private int y1 = 150;
    private int x2 = 150;
    private int y2 = 70;

    public LineTurnAround(){
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
        g.setColor(Color.MAGENTA);
        g.drawLine(x1,y1,x2,y2);
    }

    @Override
    public void run() {
        while (y2 < 150){
            try {
                y1-=1;
                y2+=1;
                this.repaint();
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
