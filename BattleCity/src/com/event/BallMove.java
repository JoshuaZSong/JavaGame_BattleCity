package com.event;

import javax.swing.*;
import java.awt.*;

public class BallMove extends JFrame {
    private final MyPanel myPanel;
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        myPanel;
        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10, 10, 20, 20);
    }
}