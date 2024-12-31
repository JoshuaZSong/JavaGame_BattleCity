package com.event;

import javax.swing.*;
import java.awt.*;

public class BallMove extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args) {

    }

    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
    }
}

class MyPanel extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10,10,20,20);
    }
}