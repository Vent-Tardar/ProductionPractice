package com.practic.vt.two.triangle;

import javax.swing.*;
import java.awt.*;

public class TrianMoving extends JPanel implements Runnable{

    private int[] x = {150, 200, 250};
    private int[] y = {250, 127, 250};
    private int stop = 0;

    public TrianMoving(){
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
        g.setColor(Color.YELLOW);
        g.fillPolygon(x, y, 3);
    }

    @Override
    public void run() {
        while (stop < 185){
            try {
                for(int i = 0; i < x.length; i++){
                    x[i]+=1;
                    y[i] = (int)(Math.sin((double) 4*x[i]*Math.PI/180)*50)+100;
                    this.repaint();
                    Thread.sleep(10);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            stop++;
        }
    }
}
