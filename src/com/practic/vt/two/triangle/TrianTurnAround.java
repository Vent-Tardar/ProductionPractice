package com.practic.vt.two.triangle;

import javax.swing.*;
import java.awt.*;

public class TrianTurnAround extends JPanel implements Runnable{

    private int[] x = {150, 200, 250};
    private int[] y = {250, 127, 250};
    private int stop = 0;

    public TrianTurnAround(){
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
        g.setColor(Color.YELLOW);
        g.fillPolygon(x, y, 3);
    }

    @Override
    public void run() {
        while (stop < 50){
            try {
                for(int i = 0; i < x.length; i++){
                    switch (i) {
                        case 0 -> {
                            x[i] += 1;
                            y[i] += 1;
                        }
                        case 1 -> {
                            y[i] -= 1;
                        }
                    }
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
